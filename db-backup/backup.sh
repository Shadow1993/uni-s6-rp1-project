#!/bin/sh

BACKUP_DIR="/backups"
TIMESTAMP=$(date +"%Y%m%d_%H%M%S")
BACKUP_FILE="$BACKUP_DIR/db_backup_$TIMESTAMP.sql.gz"

echo "Starting database backup at $(date)..."

# 1. Execute the backup
PGPASSWORD="$POSTGRES_PASSWORD" pg_dump -h "$DB_HOST" -U "$POSTGRES_USER" -d "$POSTGRES_DB" | gzip > "$BACKUP_FILE"
echo "Backup saved to $BACKUP_FILE"

# 2. Handle Retention Days (Time-based preservation)
if [ -n "$RETENTION_DAYS" ]; then
    echo "Cleaning up backups older than $RETENTION_DAYS days..."
    find "$BACKUP_DIR" -type f -name "*.sql.gz" -mtime +"$RETENTION_DAYS" -delete
fi

# 3. Handle Max Backups (Count-based preservation - "More Better" space saving)
if [ ! -z "$MAX_BACKUP_COUNT" ]; then
    echo "Enforcing maximum backup limit of $MAX_BACKUP_COUNT copies..."
    # List files sorted by time (oldest first), count how many exceed the limit, and remove them
    CURRENT_COUNT=$(ls -1 "$BACKUP_DIR"/*.sql.gz 2>/dev/null | wc -l)
    if [ "$CURRENT_COUNT" -gt "$MAX_BACKUP_COUNT" ]; then
        EXCESS=$((CURRENT_COUNT - MAX_BACKUP_COUNT))
        echo "Found excess of $EXCESS backup(s). Purging oldest..."
        ls -1t "$BACKUP_DIR"/*.sql.gz | tail -n "$EXCESS" | xargs rm -f
    fi
fi

echo "Data preservation tasks complete."
