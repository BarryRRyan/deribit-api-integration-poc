#!/bin/bash

if [ "$#" -ne 3 ]; then
  echo "Usage: getWithdrawalsFromApp.sh CURRENCY PAGESIZE OFFSET" >&2
  exit 1
fi

host="${APPHOST:-localhost}"

curl -X GET "$host:8080/account/$1/withdrawal?pagesize=$2&offset=$3" \
-H "Authorization: Bearer $TOKEN" \
-H "Content-Type: application/json"