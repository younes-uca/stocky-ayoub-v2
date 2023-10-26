package  ma.zs.stocky.ws.facade.admin.effet;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.zs.stocky.bean.core.effet.ProprietaireChequeEffet;
import ma.zs.stocky.dao.criteria.core.effet.ProprietaireChequeEffetCriteria;
import ma.zs.stocky.service.facade.admin.effet.ProprietaireChequeEffetAdminService;
import ma.zs.stocky.ws.converter.effet.ProprietaireChequeEffetConverter;
import ma.zs.stocky.ws.dto.effet.ProprietaireChequeEffetDto;
import ma.zs.stocky.zynerator.controller.AbstractController;
import ma.zs.stocky.zynerator.dto.AuditEntityDto;
import ma.zs.stocky.zynerator.util.PaginatedList;


import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.zs.stocky.zynerator.process.Result;


import org.springframework.web.multipart.MultipartFile;
import ma.zs.stocky.zynerator.dto.FileTempDto;

@RestController
@RequestMapping("/api/admin/proprietaireChequeEffet/")
public class ProprietaireChequeEffetRestAdmin  extends AbstractController<ProprietaireChequeEffet, ProprietaireChequeEffetDto, ProprietaireChequeEffetCriteria, ProprietaireChequeEffetAdminService, ProprietaireChequeEffetConverter> {



    @Operation(summary = "upload one proprietaireChequeEffet")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple proprietaireChequeEffets")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all proprietaireChequeEffets")
    @GetMapping("")
    public ResponseEntity<List<ProprietaireChequeEffetDto>> findAll() throws Exception {
        return super.findAll();
    }

    @Operation(summary = "Finds an optimized list of all proprietaireChequeEffets")
    @GetMapping("optimized")
    public ResponseEntity<List<ProprietaireChequeEffetDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @Operation(summary = "Finds a proprietaireChequeEffet by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ProprietaireChequeEffetDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @Operation(summary = "Saves the specified  proprietaireChequeEffet")
    @PostMapping("")
    public ResponseEntity<ProprietaireChequeEffetDto> save(@RequestBody ProprietaireChequeEffetDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  proprietaireChequeEffet")
    @PutMapping("")
    public ResponseEntity<ProprietaireChequeEffetDto> update(@RequestBody ProprietaireChequeEffetDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of proprietaireChequeEffet")
    @PostMapping("multiple")
    public ResponseEntity<List<ProprietaireChequeEffetDto>> delete(@RequestBody List<ProprietaireChequeEffetDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified proprietaireChequeEffet")
    @DeleteMapping("")
    public ResponseEntity<ProprietaireChequeEffetDto> delete(@RequestBody ProprietaireChequeEffetDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified proprietaireChequeEffet")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple proprietaireChequeEffets by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @Operation(summary = "Finds proprietaireChequeEffets by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ProprietaireChequeEffetDto>> findByCriteria(@RequestBody ProprietaireChequeEffetCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated proprietaireChequeEffets by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ProprietaireChequeEffetCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports proprietaireChequeEffets by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ProprietaireChequeEffetCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets proprietaireChequeEffet data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ProprietaireChequeEffetCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public ProprietaireChequeEffetRestAdmin (ProprietaireChequeEffetAdminService service, ProprietaireChequeEffetConverter converter) {
        super(service, converter);
    }




}
