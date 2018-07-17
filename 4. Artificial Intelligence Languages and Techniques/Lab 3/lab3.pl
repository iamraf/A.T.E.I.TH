figure(1, middle(triangle, square)).
figure(2, middle(circle, triangle)).
figure(3, middle(square, circle)).
figure(4, middle(square, square)).
figure(5, middle(square, triangle)).
figure(6, middle(triangle, circle)).
figure(7, middle(circle, square)).
figure(8, middle(triangle, triangle)).

figure(9, bottomleft(circle, circle)).
figure(10, topleft(circle, circle)).
figure(11, bottomright(circle, circle)).
figure(12, topright(circle, circle)).

figure(13, bottomleft(square, square)).
figure(14, topleft(square, square)).
figure(15, bottomright(square, square)).
figure(16, topright(square, square)).

relation(middle(S1, S2), middle(S2, S1), inverse).
relation(middle(S1, S2), middle(S3, S2), changein):- 
    S1 \= S3.
relation(middle(S1, S2), middle(S1, S3), changeout):-
    S2 \= S3.

relation(topleft(S1, S2), topright(S1, S2), lrmirror).
relation(bottomleft(S1, S2), bottomright(S1, S2), lrmirror).
relation(topright(S1, S2), topleft(S1, S2), lrmirror).
relation(bottomright(S1, S2), bottomleft(S1, S2), lrmirror).

relation(topleft(S1, S2), bottomleft(S1, S2), tbmirror).
relation(topright(S1, S2), bottomright(S1, S2), tbmirror).
relation(topright(S1, S2), bottomright(S1, S2), tbmirror).
relation(topleft(S1, S2), bottomleft(S1, S2), tbmirror).

relation(topleft(S1, S2), bottomright(S1, S2), diagmirror).
relation(topright(S1, S2), bottomleft(S1, S2), diagmirror).
relation(bottomleft(S1, S2), topright(S1, S2), diagmirror).
relation(bottomright(S1, S2), topleft(S1, S2), diagmirror).

analogy(A, B, C, D):-
    figure(A, S1),
    figure(B, S2),
    figure(C, S3),
    figure(D, S4),
    relation(S1, S2, R),
    relation(S3, S4, R).