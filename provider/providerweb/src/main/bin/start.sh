#!/usr/bin/env bash
exec nohup docker run -p 9191:9191 -t example > out.log 2>&1&