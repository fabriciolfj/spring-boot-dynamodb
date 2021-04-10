# Exemplo aplicação spring boot com dynamodb

### Montando ambiente
```
docker run --rm -p 4566:4566 -p 4571:4571 localstack/localstack
```
```
aws configure
Key ID: 123
Access Key: 123
Region: us-east-1
Format: text
``
```
aws dynamodb create-table --cli-input-json file://conf/customer.json --endpoint-url=http://localhost:4566
```
```
aws dynamodb list-tables --endpoint-url=http://localhost:8000
```