const originalColors = {
    '--color-1': 'rgb(34, 40, 49)',        /* color oscuro */
    '--color-2': 'rgb(238, 238, 238)',     /* color claro */
    '--color-3': 'rgb(118, 171, 174)',     /* color intermedio */
    '--color-4': 'rgb(49, 54, 63)',        /* otro color oscuro */
    '--color-5': 'rgb(0, 0, 0)',           /* negro */
    '--color-6': 'rgba(128, 128, 128, 0.489)', /* color semi-transparente */
    '--color-7': 'rgba(0, 140, 255, 0.24)',    /* color semi-transparente */
    '--color-12': '#ccc',                  /* gris claro */
    '--color-13': 'rgb(34, 40, 49)'        /* otro color oscuro */
};

const newColors = {
    '--color-1': 'rgb(238, 238, 238)',     /* color claro */
    '--color-2': 'rgb(34, 40, 49)',        /* color oscuro */
    '--color-3': 'rgb(63, 86, 152)',       /* color intermedio */
    '--color-4': 'rgb(156, 163, 176)',     /* otro color intermedio */
    '--color-5': 'rgb(34, 40, 49)',        /* otro color oscuro derivado de --color-15 */
    '--color-6': 'rgba(128, 128, 128, 0.489)', /* color semi-transparente */
    '--color-7': 'rgba(0, 140, 255, 0.5)', /* ajustado para coincidir con el nuevo tema */
    '--color-12': '#666',                  /* gris oscuro para el nuevo tema */
    '--color-13': 'rgb(238, 238, 238)'     /* otro color claro derivado del nuevo tema */
};

let usingOriginalColors = true;

const changeColorsButton = document.getElementById('change-colors');
const changeColorsButtonIcon = changeColorsButton.querySelector('img');

function applyColorsToDocument(doc, colors) {
    for (const [key, value] of Object.entries(colors)) {
        doc.documentElement.style.setProperty(key, value);
    }
}

document.getElementById('change-colors').addEventListener('click', function() {
    const colors = usingOriginalColors ? newColors : originalColors;
    applyColorsToDocument(document, colors);

    // También aplicar los colores al contenido del objeto
    const objectContent = document.getElementById('contenido').contentDocument;
    if (objectContent) {
        applyColorsToDocument(objectContent, colors);
    }

    usingOriginalColors = !usingOriginalColors;
    // Cambiar el icono del botón
    changeColorsButtonIcon.src = usingOriginalColors ? 'recursos/claro.png' : 'recursos/obscuro.png';
});