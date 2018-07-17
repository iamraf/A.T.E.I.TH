natural(0).
natural(X):-
    X > 0,
    Y is X - 1,
    natural(Y).
	
power(X, 0, 1).
power(X, 1, X).
power(X, N, P):-
    N > 1,
    N1 is N-1,
    power(X, N1, P1),
    P is X * P1.
	
fibo(1, 1).
fibo(2, 1).
fibo(N, Y):-
    N1 is N - 1,
    N2 is N - 2,
    fibo(N1, Y1),
    fibo(N2, Y2),
    Y is Y1 + Y2.
	
mkd(N, 0, N).
mkd(N, M, X):-
    N < M,
    mkd(M, N, X).
mkd(N, M, X):-
    N >= M,
    M1 is mod(N, M),
    mkd(M, M1, X).
	
run:-
    write('Dose ton arithmo A: '),
    read(A),
    write('Dose ton arithmo B: '),
    read(B),
    write('A^B = '),
    power(A, B, P),
    write(P), nl,
    fibo(A, F),
    write('fibonacci(A) = '),
    write(F), nl,
    mkd(A, B, M),
    write('MKD(A,B) = '),
    write(M), nl.