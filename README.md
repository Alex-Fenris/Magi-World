########################### 
#       Magi-World        #
#      Jeu de combat      #
###########################

-- Objectif: -- 

Développer un programme Java pour créer un jeu de combat épique pour 2 joueurs dans un cadre terminal.


-- Règles: --

Le jeu commence avec le joueur 1. Il choisit entre les personnages: Guerrier, Rodeur ou Mage.
Ensuite, il choisit ses caractéristiques: Niveau, Force, Agilité et Intelligence.
Après, le joueur 2 effectue les mêmes étapes.

Le jeu commence avec le joueur 1.
C'est un jeu tour à tour. A chaque fois, le joueur choisit entre son attaque de base ou spéciale.
Lorsqu'un joueur n'a pas de vitalité (vie), le jeu se termine et l'autre joueur gagne.
Caractéristiques: Chaque personnage possède 5 caractéristiques:

Niveau: choisi par le joueur (min 1, max 100)
Vitalité: égale à 5 fois le niveau
Force: choisi par le joueur (min 0, max 100)
Agilité: choisi par le joueur (min 0, max 100)
Intelligence: choisi par le joueur (min 0, max 100)
Attention: le total [Force + Agilité + Intelligence] doit être égal au Niveau.

Attaques: Chaque personnage possède 2 attaques.

Une attaque de base
Une attaque spéciale

-- Selon le type de personnage: --

Guerrier:
"Coup d'Epée": les dégâts de l'ennemi sont égaux à la force du joueur.
"Coup de Rage": les dégâts de l'ennemi sont égaux à 2 fois la force du joueur. 
La vitalité du payeur diminue de sa force divisée par 2.

Tireur d'élite:
"Tir à l'Arc": Les dégâts de l'ennemi sont égaux à l'agilité du joueur.
"Concentration": l'agilité du payeur augmente de son niveau divisé par 2.

Mage:
"Boule de Feu": Les dégâts de l'ennemi sont égaux à l'intelligence du joueur.
"Soin": la vitalité du payeur augmente de 2 fois son intelligence. 
Attention, il ne peut pas avoir une vitalité supérieure à sa vitalité initiale.
