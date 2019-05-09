TITLE ASK2
ASSUME CS:KODIKAS,DS:DATA
KODIKAS SEGMENT

ARXI:	
    MOV AX,DATA
    MOV DS,AX

    MOV BH,0

v1:    
    LEA DX,MES
    MOV AH,9
    INT 21H

    MOV AH,08h
    INT 21h

    CMP AL,'0'
    JB v1

    CMP AL,'9'
    JA v1
    
    MOV DL,AL
    MOV AH,2
    INT 21H

    CMP AL,'0'
    JE miden
    
    MOV AH,0
    MOV BL,2
    DIV BL

    CMP AH,0
    JE ARTIOS
    
    LEA DX,MES_PER
    MOV AH,09h
    INT 21h
    JMP Elegxos
    
artios:
    LEA DX,MES_ART
    MOV AH,09h
    INT 21h
    JMP Elegxos
    
miden:
    LEA DX,MES_ZERO
    MOV AH,09h
    INT 21h

Elegxos:
    INC BH
    CMP BH,5
    JB V1
    
    MOV AH,4CH
    INT 21H
    
KODIKAS ENDS

DATA SEGMENT   
    MES DB "Eisagete ena monopsifio arithmo 0-9",10,13,"$"
    MES_ZERO DB 10,13,"O Arithmos einai miden",10,13,"$"
    MES_ART DB 10,13,"O Arithmos einai artios",10,13,"$"
    MES_PER DB 10,13,"O Arithmos einai peritos",10,13,"$"
DATA ENDS 

END ARXI