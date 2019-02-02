TITLE ASK3
ASSUME CS:KODIKAS, DS:DEDOMENA
KODIKAS SEGMENT PUBLIC

ARXH:
    MOV AX,DEDOMENA
    MOV DS,AX
    
    LEA DX,PROTROPI
    MOV AH,09H
    INT 21H	

B1:
    MOV SI,0

B2:
    MOV AH,01H
    INT 21H

B3:
    CMP AL,13
    JE Emfanisi

B4:
    CMP AL,32
    JE B7

    CMP AL,'.'
    JE B7

B5:
    CMP AL,'A'
    JB B2

B6:
    CMP AL,'Z'
    JBE B7

    CMP AL,'a'
    JB B2

    CMP AL,'z'
    JA B2

B7:
    MOV BUFFER[SI],AL;
    INC SI

B8:
    CMP SI,40
    JB B2

Emfanisi:
    MOV CX,SI
    JCXZ TELOS
    MOV SI,0

    LEA DX,MESSAGE
    MOV AH,09H
    INT 21H

E2:
    MOV DL,BUFFER[SI]

    CMP DL,32
    JE E4

    CMP DL,'.'
    JE E4
    CMP DL,'Z'
    JA E3

    ADD DL,32
    JMP E4
        
E3:
    SUB DL,32

E4:
    MOV AH,02H
    INT 21H
    INC SI

E5:
    LOOP E2
    JMP EXIT

Telos:
    LEA DX,NOINPUT
    MOV AH,09H
    INT 21H

EXIT:	    
    MOV AH,4CH
    INT 21H

KODIKAS ENDS

DEDOMENA SEGMENT
    BUFFER   DB 40 DUP(0) ; Dilosi enos pinaka me onoma Buffer 20 theseon typou Byte
    PROTROPI DB 'Eisagete keimeno:  $';
    MESSAGE  DB 10,13,10,13,'H metatropi se mikra einai: $' ; To minima pou tha emfanistei
    NOINPUT  DB 10,13,'Den eisagate kanena charaktira. Telos programmatos$';						
DEDOMENA ENDS

END ARXH