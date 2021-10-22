#!/bin/bash

if [ "$#" -ne 3 ]; then
  echo "Usage: getDepositsFromDeribit.sh CURRENCY COUNT OFFSET" >&2
  exit 1
fi

curl -X GET "https://test.deribit.com/api/v2/private/get_deposits?count=$2&currency=$1&offset=$3" \
-H "Authorization: Bearer $TOKEN" \
-H "Content-Type: application/json"