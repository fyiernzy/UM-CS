# WIX1003 Lab Report 

## Question requirement

---

- Write a program that will perform a binary count from 00h to FFh.
- Submit your assembly code with explanation.

</br>

## Syntax Explanation

---

| Symbol  | Meaning                                                                                                                                           |
| ------- | ------------------------------------------------------------------------------------------------------------------------------------------------- |
| `ORG`   | Specify the location in which the memory required by the programme should be allocated.                                                           |
| `AJMP`  | **Unconitional Jump**                                                                                                                             |
| `A`     | a general-purpose register that can be used to hold operands for arithmetic and logical operations, and to store the results of these operations. |
| `MOV`   | **Move**                                                                                                                                          |
| `XRL`   | **Exclusive OR**                                                                                                                                  |
| `ACALL` | **Absoulte Call**                                                                                                                                 |
| `DJNZ`  | **Decrement and Jump if Not equal to Zero**                                                                                                       |
| `RET`   | **Return**                                                                                                                                        |
| `INC`   | **Increment by 1**                                                                                                                                |
| `DEC`   | **Decrement by 1**                                                                                                                                |
|         |                                                                                                                                                   |



</br>

## Code 1 Overview

---

Explanations are shown in the form of comments, which are indicated by symbol `;`

```nasm
ORG 00H ;specify the memory condition
AJMP MAIN

MAIN:   MOV A,#00H ; Assign register A with value of dec 255
        MOV P1,A ; Make port P1 as output
        AJMP LOOP

LOOP:   INC A ; Increment the value of A by 1.
        MOV B,A ; Assign the register B with value of A
        XRL B,#0FFH ; Find the 2s complement to B
        ;ACALL DELAY ; You may call delay if the simulator is running to fast
        MOV P1,B ; Assign the port P1 with the 2s complement value 
        AJMP LOOP

DELAY:  MOV R1,#010H ; Set the value of register R1 to 10
DELAY1: DJNZ R1,DELAY1 ; Decrement the R1 by 1 and compare if R1 equals 0. If not, repeat the decrement. Else, return to the original position in Loop.
        RET

END
```



</br>

## Code 2 Overview

---

```nasm
ORG 00H
AJMP MAIN

MAIN:   MOV A,#0FFH ;MOV A,#00H
        MOV P1,A
        AJMP LOOP

LOOP:   DEC A
        MOV B,A
        ;ACALL DELAY
        MOV P1,B
        AJMP LOOP

DELAY:  MOV R1,#010H
DELAY1: DJNZ R1,DELAY1
        RET

END
```

Code 2 is similar to code 1, except we assign `A` with `#0FFH` and use `DEC` instead. This allow us to skip `XRL`.

</br>
