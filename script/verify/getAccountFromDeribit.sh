#!/bin/bash

if [ "$#" -ne 1 ]; then
  echo "Usage: getAccountFromDeribit.sh CURRENCY" >&2
  echo "CURRENCY must be BTC|ETH|USDT" >&2
  exit 1
fi

curl -X GET "https://test.deribit.com/api/v2/private/get_account_summary?currency=$1&extended=true" \
-H "Authorization: Bearer $TOKEN" \
-H "Content-Type: application/json"