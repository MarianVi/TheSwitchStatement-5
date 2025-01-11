Implementează funcționarea unui modul ATM real: se citește de la tastatură un număr natural nenul n care corespunde unei anumite operații ce poate fi realizată de către ATM (exemplu: 1 - Interogare sold, 2 - Retragere numerar etc.). Vezi tabelul de mai jos pentru o listă completă de operații disponibile. În funcție de operația solicitată, ATM-ul trebuie să actualizeze informațiile specifice clientului curent (în cazul de față, sold curent).

În vederea selectării unei anumite operații, se va folosi o structură condițională de tip switch. Odată ce s-a terminat de efectuat operația solicitată de utilizator, ATM-ul își va continua execuția, așteptând o nouă comandă de la utilizator. Singura posibilitate de a întrerupe acest flux este introducerea unei operații speciale de tip ieșire (exemplu: 6 - Iesire).

Gândește-te la următoarele cazuri de eroare și tratează-le corespunzător: atât la depunerea cât și la retragerea sumei, numărul citit de la tastatură să fie divizibil cu 10, să fie pozitiv, să fie mai mic decât soldul disponibil.\
    Comandă: Interogare Sold\
    Descriere: Va afișa către utilizator soldul curent\
    Codificare (n): 1\
    \
    Comandă: Retragere Numerar\
    Descriere: Va solicita utilizatorului o sumă, va verifica dacă este validă,
    conform constrângerilor menționate în enunț și va actualiza soldul clientului\
    Codificare (n): 2\
    \
    Comandă: Depunere Numerar\
    Descriere: Va solicita utilizatorului o sumă, va verifica dacă este validă,
    conform constrângerilor menționate în enunț și va actualiza soldul clientului\
    Codificare (n): 3\
    \
    Comandă: Curs Valutar\
    Descriere: Va afișa către utilizator cursul valutar (de exemplu conversia EUR - RON)\
    Codificare (n): 4\
    \
    Comandă: Info\
    Descriere: Va afișa către utilizator anumite informații (de exemplu numele băncii,
    data și ora curentă, orice alte informații doriți să adăugați)\
    Codificare (n): 5\
    \
    Comandă: Iesire\
    Descriere: Va întrerupe execuția ATM-ului și va determina închiderea programului\
    Codificare (n): 6\
    \
    Comandă: Ajutor\
    Descriere: Va afișa către utilizator lista de comenzi disponibile\
    Codificare (n): orice alt număr n\

Console

    ===== Bine ati venit =====
    Optiuni disponibile:
        1. Interogare Sold
        2. Retragere Numerar
        3. Depunere
        4. Curs Valutar
        5. Info
        6. Iesire
     
    # INPUT: n == 1
    Soldul dumneavoastra este 1000 RON.
     
    # INPUT: n == 2, amount == 300
    Operatie efectuata cu succes!
     
    # INPUT: n == 1
    Soldul dumneavoastra este 700 RON.
     
    # INPUT: n == 40
    Optiuni disponibile:
        1. Interogare Sold
        2. Retragere Numerar
        3. Depunere
        4. Curs Valutar
        5. Info
        6. Iesire

