# Damon In A Strange Land - Oswego 3
This is the SUNY Oswego 3 team's submission for problem 1 of the October 2015 SUNY Oswego ACM programming competition. This submission worked for the example problem but failed the judging process.

The Oswego 3 team consisted of Shakhar Dasgupta, David Kear, and Christopher Wells. This sumbmission was worked on by David Kear and Christopher Wells, and the implemented program was written by Christopher Wells.

## Problem Summary
The problem was to create a program that would calculate the minimum number of rockets needed for a spaceship to travel to Mars to rescue Matt Damon before his oxygen supply runs out, and to then get him back to Eartch before the spaceship's passenger pod runs out of oxygen.

The program takes in the distance between Earth and Mars (for this problem this is variable). The weight of each rocket. The power of each rocket. The oxygen time remaining for Matt Damon on Mars. The oxygen time for Matt Damon once he enters the spaceship's rescue pod. All of these values are doubles, except for the time values, which are integers.

The change in velocity given by using up a rocket is found by taking the power of the rocket and dividing it by the total weight of the spaceship's rockets (the rest of the spaceship's weight is negligible). Once a rocket is used it is then immediately released, thus removing its wieght from the total weight of the spaceship. Also once the spaceship reaches Mars it's velocity is instantly reduced to zero. No drag forces are taken into account.

Given this information the program has to determine the minimum number of rockets required to rescue Matt Damon without his oxygen supplies running out.

## Attempted Solution
The solution attempted by the team for the problem took a look at the rocket consumption backwards. Since the change in velocity of the spaceship caused by the use of a rocket is dependant upon the power of the rocket (known) and the number of rockets remaining on the spaceship (unkown), we thought about taking a look at the problem starting with the end of the return trip.

First we would need to be able to determine the velocities needed for the original trip and the return trip. These could be easily determined by taking the distance between Earth and Mars and dividing it by the oxygen time remaining for each trip. Thus, the velocity needed for the original trip could be determined by taking the distance and dividing it by the oxygen time on Mars. and the velocity needed for the return trip could be determined by dividing the distance by the oxygen time for the rescue pod.

When the last rocket is fired to provide the velocity for the return trip there is only one rocket remaining on the spaceship. Thus the change in velocity provided by the last rocket could be determined by taking the power of a rocket and dividing it by the weight of one rocket. This process could be repeated for the second to last trip by dividing the power of a rocket by two times the weight of a rocket. By repeating this for each rocket from the last we would get the total change in velocity given by using x rockets for the return trip.

So we took the velocity needed for the return trip, which we had calculated earlier, and we kept calculating the change in velocity give by firing incrementing rockets, until the velocity given by those rockets was greater than or equal to the needed velocity.

This process could then be repeated for the return trip. By restarting at a velocity of zero, and taking into account the weight of the rockets needed for the return trip, we could repeat the same process for determining the number of rockets required for the original trip.

Then by adding together the rockets used for the original trip and for the return trip we would get the total number of rockets needed.

## Example
**Input:**
```
30
1
10
20
20
```
**Output:**
```
11
```