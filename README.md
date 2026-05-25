# uni-s6-rp1-project
University Semester 6
Računarski Praktikum 1
Projekat

## Prerequisite

Each service provides an example env/environmental file. You **__must__** make your own .env file before Starting the project

To try out, rename the respective .env.example files to .env

Configuration renaming is as follows
 - **backend**: `backend/ .env.example > .env`
 - **frontend**: `frontend/src/environments/ environment.example.ts > environment.ts`
 - **db**: `db/ .env.example > .env`
 - **db-backup**: `db-backup/ .env.example > .env`

## Starting the project

Project is started via podman or docker compose

`docker compose up -d`

## Stopping the project

Project can easily be stopped via podman or docker compose

`docker compose down`

To remove volumes run

`docker compose down -v`

### Check out the documentation files for some extra information regarding architecture (In Serbian)

## Useful commands

List backups in db-backup service

`docker exec -it db-backup ls -lh ./backups`

Copy a backup to your local directory (Replace yyyymmdd_hhmmss with the appropriate timestamp you got from the command above). Also make sure that the local-folder exists

`docker cp db-backup:/backups/db_backup_yyyymmdd_hhmmss.sql.gz ./local-folder/`

Check container stdout (replace container name if needed)

`docker logs db-backup`

Attach to container bash (replace container name if needed)

`docker exec -it db-backup ./bin/sh`