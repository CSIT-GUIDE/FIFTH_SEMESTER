likes(ram,sita).
likes(ram,trains).
likes(suresh,fast_cars).
hobby(ram,trainspotting).
hobby(saroj,sailing).
hobby(tina,trainspotting).
hobby(prakash,sailing).
likes(Person1,Person2):-hobby(Person1,X),hobby(Person2,X).
