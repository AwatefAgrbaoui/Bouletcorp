Feature: Je souhaite tester l application Bouletcorp
  En tant que utilisateur je souhaite tester l application Bouletcorp

  @aPropos
  Scenario: Je souhaite tester le bouton a propos de l application Bouletcorp
  Given Je me connecte a l application Bouletcorp
  When Je clique sur le bouton a propos 
  Then Je me redirige vers la page a propos "https://bouletcorp.com/buttons/twitch.png" "https://bouletcorp.com/buttons/masto.png" "https://bouletcorp.com/buttons/insta.png" s affiche
 