Pour notre projet Android nous avons décidé de développer une autre application que celle proposé par le cours. 
Nous avons donc décidé de mettre en œuvre une application mobile ayant pour principale fonctionnalité d'avoir accès aux horaires de la Tam pour les bus et les trams permettant à l'utilisateur de connaître les prochains passages d'une ligne à un arrêt donné. 

D'autres fonctionnalités seront également implémentées pour répondre aux besoins du cours ainsi qu'à ceux de l'application.

La plus part des données de l'application (lignes, arrêts, horaires) sont obtenus via l'api de la Tam.

Au lancement de l'application, nous sommes sur la page d'accueil.

Afficher le menu de navigation
-
Faire glisser votre doigt depuis la gauche de l'écran jusqu'au milieu.
Ou appuyer sur l'icone du menu situé en haut à gauche de l'écran. 

Arrêt
=
Permettre d'ajouter des arrets favoris sur l'accueil pour y acceder facilement
-
Sur la fenêtre d'un arrêt, cliquer sur l'icone en forme d'étoile pour ajouter l'arrêt aux favoris. (Si l'étoile est pleine, l'arrêt est dans les favoris)

Gestion des arrêts favoris
-
Sur la page d'accueil, dans la partie "Arrêts Favoris", cliquer sur l'icone menu du favoris pour acceder à sa gestion.

Recherche d'un arret par son nom
-
Sur la page d'accueil, saisir le nom de l'arrêt dans la barre de recherche (Rechercher un arrêt)
cliquer sur l'arrêt recherché.
OU
Dans la  liste des arrêts, cliquer sur l'icone en forme de loupe, puis saisir le nom de l'arrêt.
Cliquer sur l'arrêt recherché.

Noter un arrêt
-
Sur la fenêtre d'un arrêt, cliquer sur le menu contextuel en haut à gauche puis sur "Noter un arrêt".
Choisissez une note de 0 à 5.

Pour consulter les notes d'un arrêt, cliquer sur le menu contextuel en haut à gauche puis "Note de cet arrêt".

Consulter la météo d'un arrêt
-
Sur la fenêtre d'un arrêt, cliquer sur le menu contextuel en haut à gauche puis "La météo de cet arrêt"

Carte
=
Acceder au menu de navigation, puis cliquer sur "La carte"

Des lieux importants (Mairie, etc) sont affichés sur la carte. Appuyer dessus pour obtenir des informations (principalement le nom).

Pouvoirs mettre des marqueurs sur la carte (Lieu important pour l'utilisateur, différent pour chacun)
-
Rester appuyé sur l'endroit où l'on veux placer un marqueur.

Afficher les lignes de Tram ou de Bus.
-
En haut de la carte, appuyer sur le bouton radio Tram pour afficher les lignes de tram.
Sur le bouton radio Bus, pour les lignes de bus.

appuyer sur une ligne affiche (dans un toast) le nom (ou son numéro) de celle ci.


Afficher les arrêts proche via le gps


Evenements
=
Permettre le signalement d'évenement lié à un arret ou une ligne / disfonctionement / présence de controleur avec une partie serveur codée par nous
-
Sur la fenêtre d'un arrêt, cliquer sur l'icone en forme de cloche, en haut de l'écran.
Choisissez le type d'evenement.
Confirmer l'evenement.

Afficher ces signalements dans l'application
-
Ouvrir le menu de navigation, cliquer sur "Les signalements"

Horaire
=
Affichage des horaires en temps réel via l'api de la tam
-
Ouvrir le menu de navigation.
Cliquer sur lignes/arrêts, puis sur la ligne ou l'arrêt pour en afficher les horaires.

Autres menus
=
Ouvrir le menu de navigation, cliquer sur paramètre
Ouvrir le menu de navigation, cliquer sur A propos

Simulation
=
Si on se trouve à moins de 3metre d'un arret et avec une vitesse faible < 5km/h : Notification avec les prochaines horaires
-
  Fonctionnalité émulée, passer de nouvelles coordonnées au téléphone virtuel, une notification va alors apparaitre si un arrêt se trouve à moins de 10 mètres avec une vitesse < 5 km/h.
