import logging as log

#Llamamos una configuracion basica
log.basicConfig(level=log.DEBUG,
                format='%(asctime)s:%(levelname)s [%(filename)s:%(lineno)s] %(message)s', 
                datefmt='%I:%M:%D %p', 
                handlers=[
                    log.FileHandler('Leccion07/capa_datos_personas/capa_datos.log'),
                    log.StreamHandler()
                ])

if __name__ == '__main__': #Hacemos esto para que se ejecute solo con el codigo y no siempre
    
    log.debug("Mensaje a nivel debug")
    log.info("Mensaje a nivel info")
    log.warning("Mensaje a nivel warning")
    log.error("Mensaje a nivel error")
    log.critical("Mensaje a nivel critico")

