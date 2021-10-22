# Deribit API Integration POC
### System Requirements
* java ^15,
* maven ^3.6,
* bash (gitbash for windows is fine),
* docker ^18

### Before you start you will need
1. An account on deribit uat (test.deribit.com)
2. An API Access Key with at least read access to account.

### How to Create a test account on deribit uat.
* Go to https://test.deribit.com/
* Create an account by clicking: "Don't have an account"
* Fill out the registration form, ensure your email address is real as you will need it later.
* Accept their terms of service.
* Log into your email and find the activation link.

### How to Create an API key.
* Log into Deribit UAT (https://test.deribit.com/)
* Expand the options under your account nickname and go to "My account"
* On the "My Account" panel on the center-left select API
* On the right go to API Access and click "Add Key"
* Select the API permissions to grant and give the key a name
* Once created it won't appear in the UI unless you click the "Load Keys" button
* Get the client id and secret from the key.
* Go back to the "API Access" panel in "Account Settings/API"
* Click the "Load Keys" button.
* Take the client and secret id for the appropriate key.

## Building and Running
A collection of convenience scripts are available in:
> ./script/run/*

_Warning: These scripts expect to be run from project root._

### How to run the application locally.
To build a jar run this:
> ./script/run/createJar.sh

Then run in local using the following script:
> ./script/run/runOnWorkstation.sh

_If you prefer you can also run the app with mvn spring-boot:run or by running main in an IDE._ 

### How to run the application in docker.
To build a jar run this:
> ./script/run/createJar.sh

Next an image required, this can be created by running:
> ./script/run/createImage.sh

Finally, the application can be started in a container:
> ./script/run/runInDocker.sh

## Verifying the Application
A collection of convenience scripts are available in:
> ./script/verify/*

_Warning: These scripts expect to be run from project root._

They require that an access token has been created and set to TOKEN.
If you don't do that you will see authorization based client errors.

### How to create and set token.
With the client and the secret id run:
> ./script/verify/createToken.sh CLIENTID CLIENTSECRET

Retain the access_token and set it using:
> source ./script/verify/setToken.sh TOKEN

_WARNING: If you do not use source then $TOKEN won't be available to subshells._

You can now run verification scripts against either deribit or the application.
> ./script/verify/getAccountFromApp.sh CURRENCY
> 
> ./script/verify/getAccountFromDeribit.sh CURRENCY
> 
> ./script/verify/getDepositsFromApp.sh CURRENCY PAGESIZE OFFSET
> 
> ./script/verify/getDepositsFromDeribit.sh CURRENCY PAGESIZE OFFSET
> 
> ./script/verify/getWithdrawalsFromApp.sh CURRENCY PAGESIZE OFFSET
> 
> ./script/verify/getWithdrawalsFromDeribit.sh CURRENCY PAGESIZE OFFSET 

## Overriding Host
By default, the verification scripts assume localhost is in use.

To change this run:
> source ./script/verify/setAppHost.sh HOST

_WARNING: If you do not use source then $APPHOST won't be available to subshells._
