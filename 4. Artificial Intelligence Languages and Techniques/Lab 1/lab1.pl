parent(cronus, hades). 
parent(cronus, poseidon). 
parent(cronus, zeus). 
parent(cronus, demeter). 
parent(rhea, hestia). 
parent(rhea, hades). 
parent(rhea, poseidon). 
parent(rhea, zeus). 
parent(rhea, demeter). 
parent(zeus, athena). 
parent(zeus, ares). 
parent(zeus, hebe). 
parent(zeus, hephaestus). 
parent(zeus, persephone). 
parent(hera, athena). 
parent(hera, ares). 
parent(hera, hebe). 
parent(hera, hephaestus). 
parent(demeter, persephone). 

male(cronus). 
male(hades). 
male(poseidon). 
male(zeus). 
male(ares). 
male(hephastus). 

female(rhea). 
female(hestia). 
female(hera). 
female(demeter). 
female(persephone). 
female(athena). 
female(hebe).

diff(X, Y):-
    X \= Y.

father(X, Y):-
    parent(X, Y),
    male(X);

mother(X, Y):-
    parent(X, Y),
    female(X);

son(X, Y):- 
    male(X), 
    parent(Y, X). 

daughter(X, Y):- 
    female(X), 
    parent(Y, X). 

grandfather(X, Y):-
    parent(X, Z),
    parent(Z, Y),
    male(X).

grandmother(X, Y):-
    parent(X, Z),
    parent(Z, Y),
    female(X).

brother(X, Y):-
    parent(Z, X),
    parent(Z, Y),
    male(X),
    diff(X, Y).

sister(X, Y):-
    parent(Z, X),
    parent(Z, Y),
    female(X),
    diff(X, Y).

uncle(X, Y):-
    parent(Z, Y), 
    brother(X, Z). 

aunt(X, Y):-
    parent(Z, Y), 
    sister(X, Z). 