#!/usr/bin/env bash
jar --create --file=target/lib/crossRedis.jar --main-class=bob.crossRedis.CrossRedis -C target/classes .