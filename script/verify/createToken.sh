#!/bin/bash

# Create a token using the deribit test API.
# It's required in order to use the verification scripts.

if [ "$#" -ne 2 ]; then
  echo "Usage: createToken.sh CLIENTID CLIENTSECRET" >&2
  exit 1
fi

curl -X GET \
"https://test.deribit.com/api/v2/public/auth?client_id=$1&client_secret=$2&grant_type=client_credentials" \
-H "Content-Type: application/json"

echo "Take the result.access_token and call source setToken.sh TOKEN"