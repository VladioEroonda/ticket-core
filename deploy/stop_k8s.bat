@echo off

echo Stopping k8s ticket-core instances
kubectl delete ingress --all
kubectl delete service --all
kubectl delete deployment --all
kubectl delete statefulset --all
kubectl delete ingress --all

echo Done!