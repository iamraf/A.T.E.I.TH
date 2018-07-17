two_only_equal(T):-
    del(H, T, NT),
    del(H, NT, NT2),
    only_one(NT2).

del(X, [X|T], T).
del(X, [Y|T], [Y|NT]):-
    del(X,T,NT).

only_one([]).
only_one([H|T]):-
    not(member(H, T)),
    only_one(T).