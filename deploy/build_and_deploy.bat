@echo off

cd ..

echo Building Docker images
docker build -t ticket-service:1.0 -f ticket-service/Dockerfile .
::docker build -t user-service:1.0 -f ./user-service/Dockerfile .
::docker build -t routing-service:1.0 -f ./routing-service/Dockerfile .
::docker build -t department-service:1.0 -f ./department-service/Dockerfile .

echo Deploying services to Kubernetes

:: ticket-service
kubectl apply -f k8s/ticket-service.yaml
kubectl apply -f k8s/ticket-service-postgres.yaml

:: user-service
:: kubectl apply -f /k8s/user-service.yaml

:: routing-service
:: kubectl apply -f /k8s/routing-service.yaml

:: department-service
:: kubectl apply -f /k8s/department-service.yaml

:: microservices ingress
kubectl apply -f k8s/ingress.yaml

echo Done!