# lein-clojure

Stting up a quick docker + clojure service example.


## Usage

### Clear

```bash
docker system prune -a
docker volume prune
docker stop $(docker ps -a -q)
docker rm $(docker ps -a -q)
docker rmi $(docker images -a -q)
```

### Start

```bash
docker-compose build web --no-cache
docker-compose run web
```

#### Example

GET to the `/` endpoint

```bash
curl http://localhost:3000
```

POST to the `/sum` endpoint

```bash
curl -X POST http://localhost:3000/sum \
  -d '{"numbers": [1,2,7]}' \
  --header "Content-type:application/json"
```

