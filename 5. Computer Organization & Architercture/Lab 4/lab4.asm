TITLE ASK4
ASSUME CS:KODIKAS, DS:DEDOMENA, SS:SOROS
KODIKAS SEGMENT PUBLIC

KYRIO PROC NEAR
    MOV AX,DEDOMENA 
    MOV DS,AX	

    LEA DX,PROTROPI
    MOV AH,09H
    INT 21H

    MOV SI,0
    B2:
        MOV AH,01H
        INT 21H

        CMP AL,'#'
        JE KLISI
    
        MOV BUFFER[SI],AL
        INC SI

        CMP SI,80
        JB B2
    KLISI:
        CALL YPO1
        
        MOV AH,4CH
        INT 21H
KYRIO ENDP 
    
YPO1 PROC
    LEA DX,MESSAGE
    MOV AH,09H
    INT 21H

    MOV CX,SI
    MOV SI,0
    MOV BH,0

    MOV AH,01H
    INT 21H

    E2:	
        CMP AL,BUFFER[SI]
        JNE SKIP

        INC BH

	SKIP:
        INC SI

        LOOP E2

        CMP BH,0
        JNE DISPLAY

        LEA DX,NONUM
        MOV AH,9
        INT 21H
        
        JMP EXIT

    DISPLAY:
        LEA DX,YPARXEI
        MOV AH,9
        INT 21H

        CMP BH,9
        JA PSIFIA2

        MOV DL,BH
        ADD DL,48
        MOV AH,2
        INT 21H

        JMP EXIT

    PSIFIA2:
        MOV AL,BH
        MOV AH,0

        MOV CL,10
	    DIV CL

	    MOV DEKADA,AL
	    MOV MONADA,AH

	    MOV DL,DEKADA
	    ADD DL,30H
	    MOV AH,02H
	    INT 21H

	    MOV DL,MONADA
	    ADD DL,30H
	    MOV AH,02H
	    INT 21H

   	EXIT:    
        RET
YPO1 ENDP    

KODIKAS ENDS

DEDOMENA SEGMENT
    BUFFER DB 80 DUP(0)
    PROTROPI DB 'Eisagete keimeno:  $'
    MESSAGE DB 10,13,'Eisagete ena charactira: $' 
    NONUM DB 10,13,'Den yparxei o charaktiras. Telos programmatos$'
    YPARXEI DB 10,13,'To plithos ton emfaniseon mesa sto keimeno einai: $'
    DEKADA DB 0
    MONADA DB 0 						
DEDOMENA ENDS

END KYRIO