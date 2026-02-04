@echo off

echo Opening ports
kubectl port-forward deploy/ticket-service-deployment 8081:8081 &
kubectl port-forward service/ticket-db-service 5433:5433