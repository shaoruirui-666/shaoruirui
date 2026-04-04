 import {print} from './b.js';
 document.querySelector('#button1').addEventListener('click', function() {
             print();
            
          });
          document.querySelector('#button2').addEventListener('click', function() {
            console.log('点击了二按钮');
          }); 
        let ros=document.querySelectorAll('tr');
        for(let i=0;i<ros.length;i++){
          ros[i].addEventListener('mouseenter',function(){
            this.style.backgroundColor = 'pink';
          });
          ros[i].addEventListener('mouseleave',function(){
            this.style.backgroundColor = 'white';
          });
        }