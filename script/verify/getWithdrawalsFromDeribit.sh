#!/bin/bash

if [ "$#" -ne 3 ]; then
  echo "Usage: getWithdrawalsFromDeribit.sh CURRENCY COUNT OFFSET" >&2
  exit 1
fi

host="${APPHOST:-localhost}"

curl -X GET "https://test.deribit.com/api/v2/private/get_withdrawals?count=$2&currency=$1&offset=$3" \
-H "Authorization: Bearer $TOKEN" \
-H "Content-Type: application/json"