posneg([], [], []).
posneg([H|T], [H|TP], TN):-
    H >= 0,
    posneg(T, TP, TN).
posneg([H|T], TP, [H|TN]):-
    H < 0,
    posneg(T, TP, TN).

sumlist([], 0).
sumlist([H|T], SL):-
    sumlist(T, SLT),
    length(H, LH),
    SL is SLT + LH.

enwshs([], L, L).
enwshs([H|T], L1, [H|L2]):-
    not(member(H, L1)),
    enwshs(T, L1, L2).
enwshs([H|T], L1, L2):-
    member(H, L1),
    enwshs(T, L1, L2).

flat([], []).
flat([H|T], [H|LT]):-
    atomic(H),
    flat(T, LT).
flat([H|T], L):-
    flat(T, LT),
    not(atomic(H)),
    flat(H, LH),
    append(LH, LT, L).
	
memberlist(X, [H|_]):-
    member(X, H).
memberlist(X, [_|T]):-
    memberlist(X, T).