#!/bin/bash

if [ "$#" -ne 3 ]; then
  echo "Usage: getDepositsFromApp.sh CURRENCY PAGESIZE OFFSET" >&2
  echo "CURRENCY must be BTC|ETH|USDT" >&2
  exit 1
fi

host="${APPHOST:-localhost}"

curl -X GET "$host:8080/account/$1/deposit?pagesize=$2&offset=$3" \
-H "Authorization: Bearer $TOKEN" \
-H "Content-Type: application/json"