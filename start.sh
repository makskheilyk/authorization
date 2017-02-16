#!/usr/bin/env bash

mvn clean install

cd oauth-app

mvn spring-boot:run