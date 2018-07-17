sum([], 0).
sum([H|T], Sum):-
    sum(T, SumT),
    Sum is SumT + H.
	
teleytaio([X], X).
teleytaio([H|T], Last):-
    teleytaio(T, Last).
	
melos(X, [X|T]).
melos(X, [H|T]):-
    melos(X, T).
	
element([H|T], 1, H).
element([H|T], N, X):-
    N1 is N-1,
    element(T, N1, X).
	
max([X], X).
max([H|T], H):-
    max(T, MaxT),
    H > MaxT.
max([H|T], MaxT):-
    max(T, MaxT),
    H =< MaxT.
	
del(X, [X|T], T).
del(X, [H|T], [H|LT]):-
    del(X, T, LT).

delall(X, [], []).
delall(X, [X|T], LT):-
    delall(X, T, LT).
delall(X, [H|T], [H|LT]):-
    X \= H,
    delall(X, T, LT).