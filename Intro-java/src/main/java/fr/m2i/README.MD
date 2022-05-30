README

- L’email doit posseder le simbole @
- Le mot de passe doit avoir entre 8 et 20 caractères
- Créer une classe users avec les champs id,nom,prenom,email et mot de passe
- Créer un tableau des User avec 5 utilisateurs avec chacun un  id,nom,prenom,email et mot de passe
- Créer une classe utilitaire de validation qui aura 2 méthodes:
- isEmail qui retournera un booléen
- une methode isLength qui retourne un booléen et qui vérifie si une chaine est comprise entre une valeur minimal et une valeur maximale
- Au moment de l’authentification il faut vérifier le user dans la liste des users
- Si au moins un utilisateur possède un email et mot de passe correspondant : On affiche bienvenue ainsi que les informations relatives à l’utilisateur connecté
- Sinon, on affiche le message email et/ou mot de passe incorrect
- L’utilisateur aura 3 chances pour saisir des identifiants valides
