word([h,e,l,l,o]).
word([m,a,n]).
word([w,o,m,a,n]).
word([b,o,o,k]).
word([m,o,t,h,e,r]).
word([c,o,m,p,u,t,e,r]).
word([c,a,r]).
word([p,r,o,l,o,g]).
word([p,e,n,c,i,l]).
word([t,a,b,l,e]).

changeletter(Word, CorrectWord):-
    append(Begin, [Letter1|End], Word),
    append(Begin, [Letter2|End], CorrectWord),
    word(CorrectWord),
    Letter1 \= Letter2.

swapletters(Word,CorrectWord):-
    append(Begin,[Letter1,Letter2|Rest],Word),
    append(Begin,[Letter2,Letter1|Rest],CorrectWord),
    word(CorrectWord).

exchangeletters(Word,CorrectWord):-
    append(Begin,[Letter2|End],Word),
    append(Top,[Letter1|Middle],Begin),
    append(Top,[Letter2|Middle],CorrectHalf),
    append(CorrectHalf,[Letter1|End],CorrectWord),
    word(CorrectWord).

delete2(Word,CorrectWord):-
    append(Begin,[Letter|Rest],Word),
    append(Middle,[Letter2|End],Rest),
    append(Middle,End,Half),
    append(Begin,Half,CorrectWord),
    word(CorrectWord),
    Letter\=Letter2.

movefront(Word,CorrectWord):-
    append(Begin,Rest,Word),
    append(Middle,[Letter|End],Rest),
    append(Begin,[Letter|Middle],Half),
    append(Half,End,CorrectWord),
    word(CorrectWord).
	
spell_check([]).
spell_check([Head|Tail]):-
    word(Head),
    spell_check(Tail).
spell_check([Head|Tail]):-
    swapletters(Head, CorrectWord),
    write('Spelling Error (Swap): '),
    write(Head), write(' Suggest '), write(CorrectWord), nl,
    spell_check(Tail).
spell_check([Head|Tail]):-
    changeletter(Head, CorrectWord),
    write('Spelling Error (Mistype): '),
    write(Head), write(' Suggest '), write(CorrectWord), nl,
    spell_check(Tail).
spell_check([Head|Tail]):-
    exchangeletters(Head, CorrectWord),
    write('Spelling Error (Exchange): '),
    write(Head), write(' Suggest '), write(CorrectWord), nl,
    spell_check(Tail).
spell_check([Head|Tail]):-
    not(word(Head)),
    write('Unknown '), write(Head), nl,
    spell_check(Tail).
