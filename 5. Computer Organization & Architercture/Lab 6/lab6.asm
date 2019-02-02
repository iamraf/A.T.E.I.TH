title ASK6 
ASSUME CS:KODIKAS, DS:DEDOMENA, SS:SOROS
KODIKAS SEGMENT PUBLIC

MAIN PROC NEAR
    MOV AX, DEDOMENA
    MOV DS, AX

    MOV  DI,OFFSET PIN
    PUSH DI
    MOV  SI,10
    PUSH SI
    MOV  BP,OFFSET TOTAL
    PUSH BP
    CALL SUM_PIN
    
    LEA DX,MESS
    MOV AH,9
    INT 21H
    
    MOV DI,TOTAL
    PUSH DI
    CALL PRINT_HEX
    
    MOV AH,4ch
    INT 21h
MAIN ENDP

SUM_PIN PROC NEAR
    V1:
        MOV BP,SP

    V2:
        MOV AX,0

    V3:
        MOV BX,[BP+6]

    V4:
        MOV CX,[BP+4]

    V5:
        MOV DL,[BX]

    V6:
        MOV DH,0
        ADD AX,DX

    V7:
        INC BX

    V8:
        LOOP V5

    v9:
        MOV BX,[BP+2]

    v10:
        MOV [BX],AX

    V11:
        RET
SUM_PIN ENDP

PRINT_HEX PROC 
    H1:
        MOV BP,SP
        MOV CX,4    

    H2:
        MOV BX,[BP+2]

    H3:
        XOR DL,DL

        PUSH CX
        MOV CX,4

    H4:
        SHL BX,1
        RCL DL,1

    H5:
        LOOP H4 
        POP CX

    H6:
        CMP DL,9
        JA GRAMMA

        ADD DL,48
        JMP H7

    GRAMMA:
        ADD DL,55

    H7:
        MOV AH,2
        INT 21H

    H8:
        LOOP H3

    H9:
        RET
PRINT_HEX ENDP

KODIKAS ENDS

DEDOMENA SEGMENT	
    TOTAL DW 0
    PIN DB 76,42,69,23,91,35,18,50,80,100
    MESS db 10,13,'TO ATHRISMA TON STOIXION TOY PINAKA EINAI : $'
DEDOMENA ENDS

SOROS SEGMENT STACK	
    DB 256 DUP(0)
SOROS ENDS

END MAIN