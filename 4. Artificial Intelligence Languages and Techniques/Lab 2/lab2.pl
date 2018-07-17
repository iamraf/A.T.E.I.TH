and(0, 0, 0).
and(0, 1, 0).
and(1, 0, 0).
and(1, 1, 1).

or(0, 0, 0).
or(0, 1, 1).
or(1, 0, 1).
or(1, 1, 1).

xor(0, 0, 0).
xor(0, 1, 1).
xor(1, 0, 1).
xor(1, 1, 0).

half_adder(A, B, S, C):-
    and(A, B, C),
    xor(A, B, S).
	
full_adder(A, B, Cin, S, Cout):-
    half_adder(A, B, S1, C1),
    half_adder(S1, Cin, S, C2),
    or(C1, C2, Cout).
	
threebit_adder(Cin, X2, X1, X0, Y2, Y1, Y0, Cout, S2, S1, S0):-
    full_adder(X0, Y0, Cin, S0, Cout1),
    full_adder(X1, Y1, Cout1, S1, Cout2),
    full_adder(X2, Y2, Cout2, S2, Cout).