docker-compose down

cd ./alice
./gradlew clean build
cd ..

cd ./bob
./gradlew clean build
cd ..

docker-compose up -d --build