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
    word(CorrectWord),
    append(Begin, [Letter2|End], CorrectWord),
    Letter1 \= Letter2.
	
swapletters(Word, CorrectWord):-
    append(Begin, [Letter1|Ypoloipo], Word),
    Ypoloipo = [Letter2|End],
    word(CorrectWord),
    append(Begin, [Letter2|YpoloipoCW], CorrectWord),
    YpoloipoCW = [Letter1|End],
    Letter1 \= Letter2.
	
exchangeletters(Word, CorrectWord):-
    append(Begin, [Letter1,Letter2|End], Word),
    word(CorrectWord),
    append(Begin, [Letter2,Letter1|End], CorrectWord),
    Letter1 \= Letter2.
	
delete2(Word, CorrectWord):-
    append(Begin, [Letter1|Ypoloipo], Word),
    append(Middle, [Letter2|End], Ypoloipo),
    word(CorrectWord),
    append(Begin, YpoloipoCW, CorrectWord),
    append(Middle, End, YpoloipoCW),
    Letter1 \= Letter2.
	
movefront(Word, CorrectWord):-
    append(Begin, Ypoloipo, Word),
    append(Middle, [Letter|End], Ypoloipo),
    word(CorrectWord),
    append(Begin, YpoloipoCW, CorrectWord),
    append([Letter|Middle], End, YpoloipoCW).
	
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