# omi-agent-lib
Library of agents that push data to O-MI nodes from various sources with semantic annotations.

## Introduction
This project contains a library and agents that pull real-time data from different sources and push it to an O-MI node via HTTP requests.

More information about O-MI nodes, a standardized messaging interface for the IoT can be found here: https://github.com/AaltoAsia/O-MI

## Available agents
* BrusselsAgent: Pulls real-time parking data from Brussels Open Data portal (http://opendatastore.brussels) and publishes the data via a MobiVoc (https://github.com/vocol/mobivoc) annotated O-DF tree.
* LyonAgent: Pulls real-time parking data from Grand Lyon Open Data portal (https://data.grandlyon.com/) and publishes the data via a MobiVoc (https://github.com/vocol/mobivoc) annotated O-DF tree.

