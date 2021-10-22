#!/bin/bash

if [ "$#" -ne 1 ]; then
  echo "Usage: getAccountFromApp.sh CURRENCY" >&2
  echo "CURRENCY must be BTC|ETH|USDT" >&2
  exit 1
fi

host="${APPHOST:-localhost}"

curl -X GET "$host:8080/account/$1" \
-H "Authorization: Bearer $TOKEN" \
-H "Content-Type: application/json"