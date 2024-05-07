<!-- Componente principal donde se utiliza CrudButtonComponent -->
<template>
  <ion-page>
    <ion-header :translucent="true">
      <ion-toolbar>
        <ion-title>Carrito de compra</ion-title>
      </ion-toolbar>
    </ion-header>
    <ion-content>
      <div id="login-container">
        <div id="login-form">
          <InputComponent id="codigo" name="codigo" label="codigo: " />
          <InputComponent id="nombre" name="nombre" label="Nombre: " />
          <InputComponent id="direccion" name="direccion" label="direccion: " />
        </div>
       
        <div>
          <!-- Traer el componente de los botones de la crud -->
          <CrudButtonComponent @createRecord="createRecord" />
        </div>
      </div>
    </ion-content>
  </ion-page>
</template>

<script setup lang="ts">
import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar, IonIcon } from '@ionic/vue';
import InputComponent from '@/components/InputComponent.vue';
import CrudButtonComponent from '@/components/CrudButtonComponent.vue';
import * as IonIcons from 'ionicons/icons';
import axios from 'axios';
import Swal from 'sweetalert2';


// Rutas de la API
const baseURL = 'http://localhost:9000/quiz_3/api/provedor';

// Métodos para interactuar con la API
// Crear registro
async function createRecord() {
  const data = {
    codigo: codigo.value,
    nombre: nombre.value,
    direccion: direccion.value
  };

  try {
    const response = await axios.post(baseURL, data);
    console.log('Registro creado exitosamente:', response.data);
  } catch (error) {
    console.error('Error al crear el registro:', error);
  }
}


</script>

<style scoped src="../theme/container.css"></style>
