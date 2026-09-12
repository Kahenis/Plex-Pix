# Plex-Pix

**Plex-Pix** est une application **Android TV** pour parcourir, afficher et lire les **photos et vidéos personnelles** hébergées sur un serveur Plex Media Server.

Ce dépôt est le **canal de publication officiel**. Seuls les binaires (APK) et la documentation sont distribués ici. **Le code source n’est pas publié.**

Version actuelle : **1.3.13** (binaire obfusqué R8)

Un extrait du **source obfusqué** (décompilé, non original) est dans [`src/`](src/).

Téléchargement : [Plex-Pix-1.3.13.apk](https://github.com/Kahenis/Plex-Pix/releases/download/v1.3.13/Plex-Pix-1.3.13.apk)

---

## Avertissement — projet indépendant

Plex-Pix est un **projet personnel, non officiel**.

- Il n’est **pas affilié**, sponsorisé, approuvé ni maintenu par Plex, Inc.
- Le nom « Plex » et les marques associées restent la propriété de leurs détenteurs.
- L’application n’utilise **que les interfaces publiques** de Plex (API HTTP du Media Server, authentification PIN / token).

---

## Pourquoi cette application ?

Plex propose d’excellents clients pour les films, séries et musique. Il n’existe pas d’application officielle Android TV vraiment pensée pour les **bibliothèques Photos / Home Videos**. Plex-Pix comble ce manque pour un usage personnel à la maison : télécommande, grandes vignettes, diaporama, albums.

---

## Fonctionnalités

- Connexion à un compte Plex via le **code PIN** (et QR code).
- Serveur principal, ou serveur ami si le compte n’en possède pas.
- Bibliothèques photo / vidéo, navigation par dossiers.
- Grille de vignettes adaptée à la TV (focus, d-pad).
- Visionneuse photo, diaporama, lecteur vidéo.
- Mises à jour depuis l’application (canal officiel).

---

## Sécurité et vie privée

| Point | Approche |
| --- | --- |
| Compte Plex | Authentification officielle PIN / token. Pas de mot de passe stocké en clair. |
| Jeton | Conservé localement sur l’appareil, révocable depuis plex.tv. |
| Données média | Les photos et vidéos **restent sur votre serveur Plex**. |
| Réseau | Usage idéal en **réseau local**. |
| Télémétrie | Aucune collecte. |

---

## Prérequis

- Télévision sous Android TV
- Au moins un serveur Plex avec une bibliothèque Photos / vidéos

---

## Installation

- Télécharger l’APK (présent dans [Releases](https://github.com/Kahenis/Plex-Pix/releases))
- Transférer l’APK sur la TV
- Lancer l’installation depuis le gestionnaire de fichiers de la TV
- Accepter l’installation d’une appli non signée

---

## Licence

Plex-Pix est **gratuit à utiliser**.

Le code source n’est pas distribué. Sauf **autorisation écrite** de l’auteur : **modification interdite**, **publication d’une version modifiée interdite**. Détail dans [`LICENSE`](LICENSE).

Plex® est une marque de Plex, Inc. Plex-Pix n’est pas un produit Plex.
