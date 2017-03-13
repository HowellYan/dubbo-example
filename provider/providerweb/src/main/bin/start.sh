#!/usr/bin/env bash
exec nohup docker run -p 9191:9191 -t providerweb > out.log 2>&1&