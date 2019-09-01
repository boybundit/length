# Tasks

1. I need a length, they can compare with each other, like 1==1, 2==2
- ~~Length(1) == Length(1)~~
- ~~Length(2) == Length(2)~~
- ~~Length(1) !== Length(2)~~

2. Add a unit, the same unit can be compared, like 1cm==1cm
- ~~Length(1, cm) == Length(1, cm)~~
- ~~Length(1, cm) !== Length(2, cm)~~
- ~~Length(1, m) == Length(1, m)~~
- ~~Length(1, m) !== Length(2, m)~~
- ~~Length(1, cm) !== Length(1, m)~~

3. The length of different units can also be compared after conversion like: 100cm==1m
- ~~Length(100cm).toBaseUnit() == Length(1m)~~
- ~~Length(100cm) == Length(1m)~~
