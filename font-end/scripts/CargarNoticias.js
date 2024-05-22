
var noticiasJSON = {
  "noticias": [
    {
      "id": 1,
      "titulo": "Cómo conocer la información del sistema en Windows",
      "imagen": "https://www.adslzone.net/app/uploads-adslzone.net/2021/05/hardware-pc-windows.jpg",
      "resumen": "El sistema operativo, el procesador, el disco duro o la memoria RAM forman parte del hardware de un equipo informático. Pero no están ahí sin más. Saber la información sobre ellos nos puede servir para muchas cosas. Por ejemplo, para hacernos una idea de su rendimiento con determinados programas, con qué aplicaciones son compatibles, etc. Aquí, os daremos los detalles para conocer la información del sistema de vuestro ordenador y los componentes hardware en Windows 10.",
      "fecha": "16 de abril, 2024",
      "enlace": "https://www.adslzone.net/esenciales/windows-10/informacion-sistema-windows-10/"
    },
    {
      "id": 2,
      "titulo": "Controla la temperatura de tu PC con las mejores aplicaciones",
      "imagen": "https://hardzone.es/app/uploads-hardzone.es/2020/09/temperatura-pc.jpg",
      "resumen": "Todos los componentes tienen que estar funcionando a una temperatura correcta. De este modo, surge la necesidad de encontrar las mejores aplicaciones para medir la temperatura de nuestro equipo. Opciones como HWMonitor, HWInfo, NZXT CAM o Core Temp pueden ser tu salvación y en este artículo vamos a listar las que nos parecen mejores.",
      "fecha": "09 de mayo, 2024",
      "enlace": "https://hardzone.es/tutoriales/rendimiento/mejores-aplicaciones-temperatura-pc/"
    },
    {
      "id": 3,
      "titulo": "No actualices los drivers a mano, estas herramientas lo harán por ti",
      "imagen": "https://hardzone.es/app/uploads-hardzone.es/2018/07/AMD-vs-NVIDIA-drivers-02.jpg",
      "resumen": "La gran mayoría de usuarios suele actualizar únicamente los drivers de la tarjeta gráfica, olvidándose del resto. Pero tan importante es actualizar los drivers de la gráfica, como el de la controladora SATA o la tarjeta de red. Hacerlo manualmente es tremendamente complicado y tedioso. Pero tranquilo, Windows permite hacerlo fácilmente o también podemos hacerlo mediante herramientas para actualizar drivers.",
      "fecha": " 08 de mayo, 2024",
      "enlace": "https://hardzone.es/tutoriales/mantenimiento/actualizar-drivers-pc-automatico/"
    },
    {
      "id": 4,
      "titulo": "USB, HDMI, VGA… aprende a identificar todos los puertos de tu PC",
      "imagen": "https://hardzone.es/app/uploads-hardzone.es/2021/04/tarjeta.jpg",
      "resumen": "Los puertos de entrada y salida (E/S) han estado en los ordenadores desde el principio de los tiempos. Estos puertos son necesarios para que exista una comunicación entre la máquina y el usuario. Como es lógico, a lo largo del tiempo los conectores han ido evolucionando, algunos se han quedado por el camino y otros han ido adaptándose a las necesidades de cada época.",
      "fecha": "09 de mayo, 2024",
      "enlace": "https://hardzone.es/tutoriales/componentes/puertos-entrada-salida/"
    },
    {
      "id": 5,
      "titulo": "Estos son los tipos de socket que podemos ver en una placa base",
      "imagen": "https://hardzone.es/app/uploads-hardzone.es/2023/09/placa.jpg",
      "resumen": "Los procesadores, en ordenadores de sobremesa, se instalan en un zócalo especialmente diseñado para este componente. Existen, actualmente, dos tipos de zócalo o socket para procesadores de sobremesa y uno específico para procesadores de portátiles. Te explicaremos las características del socket LGA y PGA para PC y el socket BGA para ordenadores portátiles y cuál es el mejor dependiendo del uso y rendimiento que vayas a exigirle a tu futuro ordenador.",
      "fecha": "02 de febrero, 2024",
      "enlace": "https://hardzone.es/reportajes/comparativas/socket-pga-lga-placa-base/"
    },
    {
      "id": 6,
      "titulo": "Conecté un componente nuevo a mi PC y no lo detectaba: así conseguí configurarlo en Windows",
      "imagen": "https://www.softzone.es/app/uploads-softzone.es/2024/04/detectar-nuevo-periferico-windows.jpg",
      "resumen": "Algo que me ha pasado muchas veces al conectar periféricos, sobre todo, es que Windows no lo detecta. Esto es algo bastante normal, ya que podemos decir que es un sistema operativo bastante «tonto». Pero, lo cierto es que cuenta con la función de buscar cambios de hardware que nos ayudará bastante. Mediante esta opción lo que podemos conseguir es que se detecte el nuevo dispositivo y Windows lo configure.",
      "fecha": "05 de abril, 2024",
      "enlace": "https://www.softzone.es/noticias/windows/detectar-nuevo-hardware-windows/"
    },
    {
      "id": 7,
      "titulo": "Mover un disco duro con Windows de un PC a otro nuevo",
      "imagen": "https://www.softzone.es/app/uploads-softzone.es/2021/12/SSD-Cambio-Windows-1.jpg",
      "resumen": "Cuando instalamos Windows de cero en un ordenador, el sistema operativo se configura automáticamente para funcionar acorde a los componentes de dicho ordenador. Se configuran todos los elementos necesarios para que el sistema funcione, se instalan y configuran los drivers y se ajusta el Kernel para la configuración de nuestro PC. Sin embargo, si el día de mañana queremos hacer un cambio grande en el hardware del sistema (por ejemplo, un cambio de placa base), o compramos un ordenador completo nuevo, ¿qué pasa con Windows y nuestro disco duro?",
      "fecha": "15 de febrero, 2024",
      "enlace": "https://www.softzone.es/windows/como-se-hace/mover-disco-duro-windows-ordenador/"
    },
    {
      "id": 8,
      "titulo": "Descubre nuestra lista con los mejores procesadores gaming de 2024 y disfruta de una experiencia de juego increíble. ¡Sigue leyendo!",
      "imagen": "https://img.pccomponentes.com/pcblog/935/mejores-procesadores-gaming-1.jpg",
      "resumen": "¿Buscas un buen procesador para tu PC gaming? Estás en el lugar indicado, desde la redacción de PcComponentes hemos realizado una lista con los mejores procesadores gaming (Intel y AMD) para que puedas disfrutar de tus partidas con el mejor rendimiento",
      "fecha": "19 de abril de 2023",
      "enlace": "https://www.pccomponentes.com/los-mejores-procesadores-gaming"
    }
  ]
}

 function cargarNoticias() {
  var contenedor = document.getElementById('news-container');
  noticiasJSON.noticias.forEach(function(noticia) {
    var newsContainer = document.createElement('div');
    newsContainer.classList.add('newsInfo');
    var contenido = `
    <a href="${noticia.enlace}" target="_blank">
      <div class="imgnot">
      <img src="${noticia.imagen}" alt="${noticia.titulo}">
      </div>
      <h1>${noticia.titulo}</h1>
      <p class="newsText">${noticia.resumen}</p>
      <p class="fecha">${noticia.fecha}</p>
    </a>
  `;

  newsContainer.innerHTML = contenido;
  contenedor.appendChild(newsContainer);
});
}