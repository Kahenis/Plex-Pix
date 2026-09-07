# Plex-Pix

**Plex-Pix** est une application **Android TV** conçue pour parcourir, afficher et lire les **photos et vidéos personnelles** hébergées sur un serveur Plex Media Server, sur le grand écran.

Plex propose d’excellents clients pour les films, séries et musique. En revanche, il n’existe pas d’application officielle Android TV vraiment pensée pour les **bibliothèques Photos / Home Videos** : navigation au d-pad, grilles de vignettes, diaporama, lecture vidéo familiale, albums et métadonnées. Plex-Pix vise à combler ce manque pour un usage personnel à la maison.

---

## Avertissement — projet indépendant

Plex-Pix est un **projet personnel, non officiel**.

- Il n’est **pas affilié**, sponsorisé, approuvé ni maintenu par Plex, Inc. ni par les équipes produit / support Plex.
- Le nom « Plex » et les marques associées restent la propriété de leurs détenteurs.
- L’application n’utilise **que les outils et interfaces publics** fournis par Plex (API HTTP documentée du Media Server, flux d’authentification public PIN / token, endpoints de bibliothèques et de médias accessibles à un client autorisé).
- Aucun outil interne, SDK privé, reverse-engineering d’applications officielles ou accès non documenté n’est requis ni employé.
- Le projet peut cesser de fonctionner si Plex fait évoluer ses API publiques. Aucune garantie n’est donnée.

---

## Pourquoi cette application ?

Sur un téléviseur, regarder les souvenirs familiaux devrait être aussi simple que de lancer un film : télécommande, grandes vignettes, diaporama, albums par date ou dossier.

Sans client TV dédié aux photos / vidéos perso, on se retrouve à :

- ouvrir Plex « films » et chercher une bibliothèque mal adaptée au d-pad ;
- brancher une clé USB ;
- passer par le téléphone et le mirroring.

Plex-Pix recentre l’expérience sur **ce que Plex sait déjà faire côté serveur** (indexation, miniatures, transcodage éventuel, permissions utilisateurs) tout en proposant une **interface Leanback / Android TV**.

---

## Fonctionnalités visées

- Connexion à un compte Plex via le **flux public PIN** (code affiché à l’écran, validation sur plex.tv).
- Découverte des serveurs auxquels le compte a accès (local et distant, selon la config Plex).
- Liste des bibliothèques de type **photo** et **home video**.
- Navigation par dossiers / albums, dates, et métadonnées exposées par le serveur.
- Grille de vignettes adaptée à la TV (focus, d-pad, retour arrière).
- Visionneuse photo plein écran et **diaporama**.
- Lecteur vidéo pour les clips familiaux, en s’appuyant sur les URL de média fournies par le serveur.
- Multi-utilisateurs Plex : on ne voit que ce que le token autorise déjà côté serveur.

Le périmètre exact évolue avec le code ; ce README décrit l’intention produit.

---

## Architecture et API publiques

Plex-Pix se comporte comme n’importe quel **client Plex tiers documenté** :

1. Authentification auprès de plex.tv (PIN → `authToken`).
2. Récupération de la liste des ressources / serveurs du compte.
3. Appels HTTP au Media Server (`/library/sections`, contenu d’une section, métadonnées d’un item, URL de miniature ou de flux).
4. Lecture des fichiers via les liens que le serveur délivre au client authentifié (direct play ou transcodage selon le serveur).

Aucun proxy maison n’est obligatoire : le téléviseur parle au serveur Plex (LAN de préférence) et à plex.tv uniquement pour l’auth.

---

## Sécurité et vie privée

Les photos de famille sont sensibles. Les principes suivants s’appliquent :

| Point | Approche |
| --- | --- |
| Compte Plex | Authentification officielle PIN / token. Pas de mot de passe stocké en clair. |
| Jeton | Conservé localement sur l’appareil (stockage privé Android), révocable depuis plex.tv (appareils autorisés). |
| Données média | Les photos et vidéos **restent sur votre serveur Plex**. L’app ne les téléverse pas vers un cloud tiers. |
| Réseau | Usage idéal en **réseau local**. L’accès distant dépend uniquement de ce que *vous* avez activé dans Plex (Relay, accès distant, HTTPS). |
| Permissions | Héritage des partages Plex : un utilisateur « kids » ne voit que les bibliothèques que l’admin a partagées. |
| Télémétrie | Pas de collecteur analytics propriétaire prévu. |
| Code | Projet ouvert : chacun peut vérifier qu’aucun endpoint occulté n’envoie vos souvenirs ailleurs. |

Recommandations d’usage :

- privilégier le LAN et un serveur à jour ;
- révoquer le token si une TV quitte le foyer ;
- ne pas sideloader un APK provenant d’une source autre que ce dépôt / vos propres builds.

---

## Avantages par rapport au client Plex généraliste

- **Interface TV dédiée aux souvenirs**, pas aux catalogues films/séries.
- Navigation pensée albums, dates, dossiers photo plutôt que « On Deck ».
- Diaporama et visionneuse au premier plan.
- Moins de bruit UI ( continua, découverte, boutique).
- Contrôle total : vous compilez, vous voyez le code, vous hébergez les médias.
- Respect du modèle de confiance Plex existant (même serveur, mêmes droits).

Ce n’est pas un remplacement du client Plex officiel pour le cinéma. C’est un **complément** pour le salon photo / vidéo famille.

---

## Prérequis

Television sous Android TV
Au moins 1 Serveur plex avec une catégorie "Photos/videos" 
Avoir envie de partager ses plus belles photos avec ses amis
---

## Installation

Possibilité 1 — transfert de l’APK sur la TV

•	Télécharger l’APK (present dans releases).
•	Transférer l’APK sur la TV.
•	Installer depuis le gestionnaire de fichiers.
•	Accepter l’installation d’une appli inconnue.

Possibilité 2 — ADB (ADB doit être installé sur l'ordinateur)

•	Dans les réglages TV passer en Mode développeur (5 appuis sur le numéro de build) + activer le débogage USB
• Dans les réglages réseau de la TV, verifier l'adresse IP. 
• Copier l'APK dans le dossier ADB (plus rapide)
•	adb connect IP_DE_LA_TV
• adb install nomfichier.apk
• Attendre que l'icone de Plex-Pix apparaisse dans le launcher0



## Statut du projet

Développement en cours. 
L'application est fonctionnelle et contient 80 % des fonctions totales
Quelques bugs mineurs sont en cours de suppression.
Retours et issues sont les bienvenus tant qu’ils restent dans l’esprit : **API publiques uniquement**, pas d’usurpation de marque Plex ni de fonctions non autorisées.

---

## Licence et mentions

Le code de ce dépôt sera publié sous la licence indiquée dans le fichier `LICENSE` lorsque la version passera en version final 2.0.

Plex® est une marque de Plex, Inc. Plex-Pix n’est pas un produit Plex.
