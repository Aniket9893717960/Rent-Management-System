/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

const agreeButton = document.getElementById('agreeButton');
const agreementText = document.getElementById('agreementText');

agreeButton.addEventListener('click', () => {
  if (agreementText.style.display === 'none') {
    agreementText.style.display = 'block';
  } else {
    agreementText.style.display = 'none';
  }
});
