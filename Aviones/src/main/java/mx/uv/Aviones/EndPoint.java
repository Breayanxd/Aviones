package mx.uv.Aviones;

import java.util.Optional;

import com.github.cliftonlabs.json_simple.JsonObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.aviones.CreateAvionRequest;
import https.t4is_uv_mx.aviones.CreateAvionResponse;
import https.t4is_uv_mx.aviones.DeleteAvionRequest;
import https.t4is_uv_mx.aviones.DeleteAvionResponse;
import https.t4is_uv_mx.aviones.ReadAllAvionesResponse;
import https.t4is_uv_mx.aviones.ReadOneAvionRequest;
import https.t4is_uv_mx.aviones.ReadOneAvionResponse;
import https.t4is_uv_mx.aviones.UpdateAvionRequest;
import https.t4is_uv_mx.aviones.UpdateAvionResponse;

@Endpoint
public class EndPoint {
    @Autowired
    private IAvion iAvion;

    @PayloadRoot(localPart="CreateAvionRequest",namespace="https://t4is.uv.mx/aviones")
    @ResponsePayload
    public CreateAvionResponse Crear (@RequestPayload CreateAvionRequest peticion){
        CreateAvionResponse response=new CreateAvionResponse();
        Avion avion = new Avion();
        avion.setModelo(peticion.getModelo());
        avion.setAerolinea(peticion.getAerolinea());
        avion.setNoAsientos(peticion.getNoAsientos());
        avion.setTipo(peticion.getTipo());
        iAvion.save(avion);
        response.setRespuesta("Avión creado: "+ peticion.getModelo() + ", " + peticion.getAerolinea()+", "+ peticion.getNoAsientos()+", "+ peticion.getTipo());
        return response;
    }

    @PayloadRoot(localPart = "ReadAllAvionesRequest", namespace = "https://t4is.uv.mx/aviones")
    @ResponsePayload
    public ReadAllAvionesResponse MostrarAll() {
        ReadAllAvionesResponse response = new ReadAllAvionesResponse();
        Iterable<Avion> aviones = iAvion.findAll();
        JsonObject personaJson= new JsonObject();
    
        for (Avion x : aviones){
            JsonObject datosJson = new JsonObject();
            datosJson.put("modelo", x.getModelo());
            datosJson.put("aerolínea", x.getAerolinea());
            datosJson.put("noAsientos", x.getAsientos());
            datosJson.put("tipo", x.getTipo());
            personaJson.put(x.getId().toString(), datosJson);
        }
        response.setRespuesta(personaJson.toString());
        return response;
    }

    @PayloadRoot(localPart = "ReadOneAvionRequest", namespace="https://t4is.uv.mx/aviones")

    @ResponsePayload
    public ReadOneAvionResponse Pedir(@RequestPayload ReadOneAvionRequest peticion) {
        ReadOneAvionResponse response = new ReadOneAvionResponse();
        if(iAvion.findById(peticion.getId()).isPresent()){
            Avion avion = iAvion.findById(peticion.getId()).get();
            response.setRespuesta("modelo: "+avion.getModelo()+" aerolínea: "+avion.getAerolinea()+" noAsiento: "+avion.getAsientos()+" tipo: "+avion.getTipo());
        }else{
            response.setRespuesta("El avion con id "+peticion.getId()+" no existe en la BD");
        }
        return response;
    }

    @PayloadRoot(localPart="UpdateAvionRequest",namespace="https://t4is.uv.mx/aviones")
    @ResponsePayload
    public UpdateAvionResponse Modificar (@RequestPayload UpdateAvionRequest peticion){
        UpdateAvionResponse response = new UpdateAvionResponse();
        
        if(iAvion.findById(peticion.getId()).isPresent()){
            Optional<Avion> data = iAvion.findById(peticion.getId());
            Avion recuperado=data.get();
            recuperado.setModelo(peticion.getNewModelo());
            recuperado.setAerolinea(peticion.getNewAerolinea());
            recuperado.setNoAsientos(peticion.getNewNoAsientos());
            recuperado.setTipo(peticion.getNewTipo());
            iAvion.save(recuperado);
            response.setRespuesta("El Avión con id "+ peticion.getId() +" ha sido modificado correctamente");
        }else{
            response.setRespuesta("El Avión con id "+ peticion.getId() +" no ha sido encontrado en la BD");    
        }
        return response;
    }

    @PayloadRoot(localPart="DeleteAvionRequest",namespace="https://t4is.uv.mx/aviones")
    @ResponsePayload
    public DeleteAvionResponse Eliminar(@RequestPayload DeleteAvionRequest peticion) {
        DeleteAvionResponse response= new DeleteAvionResponse();
        if(iAvion.findById(peticion.getId()).isPresent()){
            response.setRespuesta("El Avión con id "+ peticion.getId() +" ha sido elimiando");
            iAvion.deleteById(peticion.getId());
        }else{
            response.setRespuesta("El Avión con id "+ peticion.getId() +" no ha sido encontrado en la BD");    
        }
        return response;
    }
}
