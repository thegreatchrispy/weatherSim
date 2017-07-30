# weatherSim
This is a Java implementation of a simple weather simulator. 

The graphics library that will be used has yet to be decided.

The build for this project uses Ant. Download the latest version of Apache Ant from [this link](http://ant.apache.org/bindownload.cgi).

## Parameters

Parameters that will be taken into consideration for this simulator are currently planned to include:

1. Air
   * Altitude
   * Temperature
   * Pressure
2. Water
   * Humidity
   * Vapor Pressure
3. Wind
   * Speed
   * Direction

## Relationships

The planned relationships between the above parameters are the following:

|              |Altitude increase   |Temperature increase   |Pressure increase   |Vapor Pressure increase |
|--------------|--------------------|-----------------------|--------------------|------------------------|
|Altitude      |increase            |increase               |decrease            |decrease                |
|Temperature   |decrease            |increase               |increase            |decrease                |
|Pressure      |decrease            |increase               |increase            |decrease                |
|Vapor Pressure|decrease            |decrease               |decrease            |increase                |
|Humidity      |decrease            |decrease               |decrease            |increase                |

Wind speed will change proportionally to the magnitude in difference between cells of high pressure and low pressure.
Wind direction will point from cells of high pressure towards cells of low pressure. The ideal way would be for wind directions to move in a clockwise direction.

The implementation will for now be loosely based on the implementation of Conway's Game of Life found [here](https://bitstorm.org/gameoflife/code/).

## Checklist for Implementation

- [x] Create basic objects.
- [ ] Respresent weather using text.
    - [ ] Represent high pressure cells with "^".
    - [ ] Represent low pressure cells with "v".

More to come.